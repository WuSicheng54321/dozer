/*
 * Copyright 2005-2017 Dozer Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dozer.classmap;

import java.util.List;

import org.dozer.AbstractDozerTest;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Dmitry Buzdin
 */
public class CopyByReferenceContainerTest extends AbstractDozerTest{

  private CopyByReferenceContainer container;

  @Before
  public void setUp() throws Exception {
    container = new CopyByReferenceContainer();
  }

  @Test
  public void testContains() throws Exception {
    container.add(new CopyByReference("java.util.*"));
    
    assertFalse(container.contains(String.class.getName()));
    assertTrue(container.contains(List.class.getName()));
  }

}
