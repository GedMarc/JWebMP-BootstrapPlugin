JW_APP_NAME.directive('ngBsAlertClosedDirective', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngBsAlertClosedDirective);
            element.on('closed.bs.alert', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 