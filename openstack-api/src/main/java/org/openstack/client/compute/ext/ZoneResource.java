package org.openstack.client.compute.ext;

import org.openstack.client.common.Resource;
import org.openstack.client.common.ResourceExtension;
import org.openstack.model.compute.Zone;

public class ZoneResource extends Resource implements ResourceExtension {
	
	/**
	 * Return name and capabilities for this zone.
	 * 
	 * @return
	 */
	public Zone info() {
		return resource().get(Zone.class);
	}

}
