/**
 * Copyright 2011-2018 Fraunhofer-Gesellschaft zur Förderung der angewandten Wissenschaften e.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ogema.model.locations;

import org.ogema.core.model.simple.FloatResource;
import org.ogema.core.model.simple.IntegerResource;
import org.ogema.model.prototypes.Data;

/**
 * The geographic location of a vicinity, given in longitude and latitude.
 */
public interface GeographicLocation extends Data {
	/**
	 * Longitude, full degrees<br>
	 * positive: east negative: west
	 */
	IntegerResource longitudeFullDegrees();

	/**
	 * longitude, minutes of arc unit: Minutes of Arc
	 */
	FloatResource longitudeArcMinutes();

	/**
	 * Latitude, full degrees<br>
	 * positive: north, negative: south
	 */
	IntegerResource latitudeFullDegrees();

	/**
	 * latitude, minutes of arc unit: Minutes of Arc
	 */
	FloatResource latitudeArcMinutes();
}
