/**
 *
 *   Copyright 2013 sourceforge.
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
package org.gwtopenmaps.test.openlayers.client.strategy;

import org.gwtopenmaps.openlayers.client.strategy.PagingStrategy;


/**
 * Test for PagingStrategy.
 *
 * @author T. Desjardins SRP
 *
 */
public class PagingStrategyTest extends BaseStrategyTest {

    public static final String CLASS_NAME_STRATEGY_PAGING = "OpenLayers.Strategy.Paging";

    public void testPagingStrategy() {
        this.testInstanceByClassName(new PagingStrategy(), CLASS_NAME_STRATEGY_PAGING);
    }

}
