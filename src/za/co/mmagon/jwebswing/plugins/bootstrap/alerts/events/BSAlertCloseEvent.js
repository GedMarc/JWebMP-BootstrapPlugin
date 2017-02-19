JW_APP_NAME.directive('ngBsAlertCloseDirective', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngBsAlertCloseDirective);
            element.on('close.bs.alert', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 