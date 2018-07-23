import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.bootstrap.BootstrapPageConfigurator;

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

	provides IPageConfigurator with BootstrapPageConfigurator;

}
