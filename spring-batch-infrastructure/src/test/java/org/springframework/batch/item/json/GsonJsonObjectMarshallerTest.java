/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.batch.item.json;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Mahmoud Ben Hassine
 */
public class GsonJsonObjectMarshallerTest {

	@Test
	public void testJsonMarshalling() {
		// given
		GsonJsonObjectMarshaller<Foo> jsonObjectMarshaller = new GsonJsonObjectMarshaller<>();

		// when
		String foo = jsonObjectMarshaller.marshal(new Foo(1, "foo"));

		// then
		Assert.assertEquals("{\"id\":1,\"name\":\"foo\"}", foo);
	}

	public static class Foo {
		private int id;
		private String name;

		public Foo(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	}

}
