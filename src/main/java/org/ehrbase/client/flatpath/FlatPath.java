/*
 *
 *  *  Copyright (c) 2020  Stefan Spiska (Vitasystems GmbH) and Hannover Medical School
 *  *  This file is part of Project EHRbase
 *  *
 *  *  Licensed under the Apache License, Version 2.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  *  You may obtain a copy of the License at
 *  *
 *  *  http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *
 */

package org.ehrbase.client.flatpath;

import org.apache.commons.lang3.StringUtils;

public class FlatPath {
    private final String name;
    private final String atCode;
    private final FlatPath child;

    public FlatPath(String path) {

        String[] strings = StringUtils.split(path, "/", 2);
        String[] split = StringUtils.split(strings[0], "[", 2);

        name = split[0];
        if (split.length == 2) {
            atCode = split[1].replace("]", "");
        } else {
            atCode = null;
        }

        if (strings.length == 2) {
            child = new FlatPath(strings[1]);
        } else {
            child = null;
        }
    }

    public String getName() {
        return name;
    }

    public String getAtCode() {
        return atCode;
    }

    public FlatPath getChild() {
        return child;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (StringUtils.isNotBlank(atCode)) {
            sb.append("[" + atCode + "]");
        }
        if (child != null) {
            sb.append("/" + child.toString());
        }
        return sb.toString();
    }
}
