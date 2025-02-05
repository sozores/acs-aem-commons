/*
 * #%L
 * ACS AEM Commons Bundle
 * %%
 * Copyright (C) 2017 Adobe
 * %%
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
 * #L%
 */
package com.adobe.acs.commons.mcp.form;

import org.osgi.annotation.versioning.ProviderType;

import java.util.Map;

/**
 * Text field component
 */
@ProviderType
public class TextfieldComponent extends FieldComponent {
    private static final String MAX_LENGTH_OPT = "maxlength";

    @Override
    public void init() {
        Map<String, Object> properties= getProperties();
        getOption(MAX_LENGTH_OPT).ifPresent(val->properties.put(MAX_LENGTH_OPT, val));
    }
}
