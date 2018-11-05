import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.bootstrap.BootstrapPageConfigurator;
import com.jwebmp.plugins.bootstrap.implementations.BootstrapExclusionsModule;

module com.jwebmp.plugins.bootstrap {

	exports com.jwebmp.plugins.bootstrap;
	exports com.jwebmp.plugins.bootstrap.collapse;
	exports com.jwebmp.plugins.bootstrap.alerts;
	exports com.jwebmp.plugins.bootstrap.alerts.events;
	exports com.jwebmp.plugins.bootstrap.badge;
	exports com.jwebmp.plugins.bootstrap.breadcrumbs;
	exports com.jwebmp.plugins.bootstrap.buttons;
	exports com.jwebmp.plugins.bootstrap.buttons.groups;
	exports com.jwebmp.plugins.bootstrap.buttons.toolbars;
	exports com.jwebmp.plugins.bootstrap.carousel;
	exports com.jwebmp.plugins.bootstrap.carousel.events;
	exports com.jwebmp.plugins.bootstrap.carousel.features;
	exports com.jwebmp.plugins.bootstrap.close;
	exports com.jwebmp.plugins.bootstrap.containers;
	exports com.jwebmp.plugins.bootstrap.dropdown;
	exports com.jwebmp.plugins.bootstrap.dropdown.menu;
	exports com.jwebmp.plugins.bootstrap.forms;
	exports com.jwebmp.plugins.bootstrap.forms.groups;
	exports com.jwebmp.plugins.bootstrap.forms.groups.sets;
	exports com.jwebmp.plugins.bootstrap.forms.controls;
	exports com.jwebmp.plugins.bootstrap.jumbotron;
	exports com.jwebmp.plugins.bootstrap.listgroup;
	exports com.jwebmp.plugins.bootstrap.media;
	exports com.jwebmp.plugins.bootstrap.modal;
	exports com.jwebmp.plugins.bootstrap.modal.events;
	exports com.jwebmp.plugins.bootstrap.modal.features;
	exports com.jwebmp.plugins.bootstrap.navbar;
	exports com.jwebmp.plugins.bootstrap.navbar.brand;
	exports com.jwebmp.plugins.bootstrap.navbar.text;
	exports com.jwebmp.plugins.bootstrap.navbar.toggler;
	exports com.jwebmp.plugins.bootstrap.navs;
	exports com.jwebmp.plugins.bootstrap.options;
	exports com.jwebmp.plugins.bootstrap.pagination;
	exports com.jwebmp.plugins.bootstrap.panel;
	exports com.jwebmp.plugins.bootstrap.popovers;
	exports com.jwebmp.plugins.bootstrap.progressbar;
	exports com.jwebmp.plugins.bootstrap.spinner;
	exports com.jwebmp.plugins.bootstrap.tabs;
	exports com.jwebmp.plugins.bootstrap.toggle;
	exports com.jwebmp.plugins.bootstrap.tooltips;
	exports com.jwebmp.plugins.bootstrap.progressbar.bar;

	requires com.jwebmp.core;
	requires com.jwebmp.logmaster;
	requires com.fasterxml.jackson.annotation;
	requires java.logging;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with BootstrapPageConfigurator;

	provides IGuiceScanJarExclusions with BootstrapExclusionsModule;
	provides IGuiceScanModuleExclusions with BootstrapExclusionsModule;

	opens com.jwebmp.plugins.bootstrap to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.collapse to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.alerts to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.alerts.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.badge to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.breadcrumbs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.groups to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.buttons.toolbars to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.carousel to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.carousel.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.carousel.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.close to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.containers to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.dropdown.menu to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.groups to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.groups.sets to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.forms.controls to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.jumbotron to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.listgroup to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.media to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal.events to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.modal.features to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar.brand to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar.text to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navbar.toggler to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.navs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.options to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.pagination to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.panel to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.popovers to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.progressbar to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.spinner to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.tabs to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.toggle to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.tooltips to com.fasterxml.jackson.databind, com.jwebmp.core;
	opens com.jwebmp.plugins.bootstrap.progressbar.bar to com.fasterxml.jackson.databind, com.jwebmp.core;


}
