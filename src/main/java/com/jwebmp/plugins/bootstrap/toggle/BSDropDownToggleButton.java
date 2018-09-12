package com.jwebmp.plugins.bootstrap.toggle;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

public class BSDropDownToggleButton<J extends BSDropDownToggleButton<J>>
		extends Button<IComponentHierarchyBase, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSToggleChildren<IComponentHierarchyBase, J>
{
}
