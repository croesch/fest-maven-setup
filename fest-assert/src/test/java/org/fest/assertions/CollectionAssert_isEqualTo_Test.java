/*
 * Created on Jan 10, 2007
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 * Copyright @2007-2009 the original author or authors.
 */
package org.fest.assertions;

import static org.fest.util.Collections.list;

import java.util.Collection;

/**
 * Tests for <code>{@link CollectionAssert#isEqualTo(java.util.Collection)}</code>.
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class CollectionAssert_isEqualTo_Test extends GenericAssert_isEqualTo_TestCase<Collection<?>> {

  private static final Collection<String> ACTUAL = list("Luke", "Leia");
  private static final Collection<String> NOT_EQUAL = list("Anakin");

  protected CollectionAssert assertObject() {
    return new CollectionAssert(ACTUAL);
  }

  protected CollectionAssert assertObjectWithNullTarget() {
    return new CollectionAssert(null);
  }

  protected Collection<?> notEqualValue() {
    return NOT_EQUAL;
  }
}
