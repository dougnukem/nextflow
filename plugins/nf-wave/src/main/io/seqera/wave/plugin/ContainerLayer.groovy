/*
 * Copyright 2020-2022, Seqera Labs
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
 *
 */

package io.seqera.wave.plugin

import groovy.transform.Canonical
import groovy.transform.CompileStatic
import groovy.transform.ToString

/**
 * Model a container layer meta-info
 *
 * @author Paolo Di Tommaso <paolo.ditommaso@gmail.com>
 */
@Canonical
@ToString(includeNames = true, includePackage = false)
@CompileStatic
class ContainerLayer {
    String location
    String gzipDigest
    Integer gzipSize
    String tarDigest

    void validate() {
        if( !location ) throw new IllegalArgumentException("Missing layer location")
        if( !gzipDigest ) throw new IllegalArgumentException("Missing layer gzip digest")
        if( !gzipSize ) throw new IllegalArgumentException("Missing layer gzip size")
        if( !tarDigest ) throw new IllegalArgumentException("Missing layer tar digest")
    }
}
