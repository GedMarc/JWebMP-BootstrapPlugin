JW_APP_NAME.directive('ngBsCarouselSlideDirective', function ($parse) {
    return function (scope, element, attrs) {
        var fn = $parse(attrs.ngBsCarouselSlide);
        element.on('slide.bs.carousel', function (event) {
            scope.$apply(function () {
                event.preventDefault();
                fn(scope, {$event: event});
            });
        });
    };
});
