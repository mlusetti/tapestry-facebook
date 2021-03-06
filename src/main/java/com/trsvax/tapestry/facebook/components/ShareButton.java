//Copyright [2011] [Barry Books]

//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at

//       http://www.apache.org/licenses/LICENSE-2.0

//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package com.trsvax.tapestry.facebook.components;

import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.BeginRender;
import org.apache.tapestry5.annotations.SupportsInformalParameters;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 * @author bfb Facebook XFBML ShareButton component replace kind'a by the like
 *         button
 * 
 */
@SupportsInformalParameters
public class ShareButton
{
	@Inject
	private ComponentResources componentResources;

	@BeginRender
	void beginRender(MarkupWriter writer)
	{
		writer.element("fb:share-button");
		
		componentResources.renderInformalParameters(writer);
		
		writer.end();
	}
}
