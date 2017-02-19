JW_APP_NAME.directive('ngBsCarouselSlidDirective', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngBsCarouselSlidDirective);
            element.on('slid.bs.carousel', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 