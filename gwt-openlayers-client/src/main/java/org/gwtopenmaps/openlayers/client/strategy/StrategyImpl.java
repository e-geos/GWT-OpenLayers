/**
 *
 *   Copyright 2014 sourceforge.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
package org.gwtopenmaps.openlayers.client.strategy;

import org.gwtopenmaps.openlayers.client.util.JSObject;

/**
 * 
 * @author Tino Desjardins - SRP
 *
 */
public class StrategyImpl {

	public native static boolean activate(JSObject self) /*-{
		return self.activate();
	}-*/;
	
	public native static boolean deactivate(JSObject self) /*-{
		return self.activate();
	}-*/;

	/*
	 * SRP GmbH (wir noch nicht verwendet)
	 * 
	 * setzt den Layer, auf den sich Save Strategy bezieht
	 *
	 */
	public native static void setLayer(JSObject self, JSObject layer) /*-{
		self.setLayer(layer);
	}-*/;
	
	public native static JSObject getLayer(JSObject self) /*-{
		return self.layer;
	}-*/;
	
}