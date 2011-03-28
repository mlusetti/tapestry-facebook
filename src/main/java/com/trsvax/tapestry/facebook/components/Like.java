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
import org.apache.tapestry5.annotations.Parameter;
import org.apache.tapestry5.annotations.SupportsInformalParameters;
import org.apache.tapestry5.ioc.annotations.Inject;

/**
 * @author bfb Facebook XFBML Like component
 * @see <a href="http://developers.facebook.com/docs/reference/plugins/like/">Like</a>
 * @see <a href="http://developers.facebook.com/docs/reference/plugins/like-box/">Like Box</a>
 */
@SupportsInformalParameters
public class Like
{
	@Parameter(value = "literal=false")
	private boolean box;
	
	@Parameter
	private String events;

	@Inject
	private ComponentResources resources;

	@BeginRender
	void beginRender(MarkupWriter writer)
	{
		if (box)
			writer.element("fb:like");
		else
			writer.element("fb:like-box");
	
		resources.renderInformalParameters(writer);
		
		writer.end();

		if (events == null || events.length() == 0)
		{
			return;
		}
	}

}
