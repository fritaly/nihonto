/**
 * Copyright 2021-2022, Francois Ritaly
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
 */
package nihonto.kantei;

import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@Builder
@With
public class Kantei {

    General general;

    Geometry geometry;

    Signature signature;

    Measurements measurements;

    Hada hada;

    Curvature curvature;

    Kissaki kissaki;

    Mune mune;

    Hamon hamon;

    Yakiba yakiba;

    Boshi boshi;

    Nakago nakago;

    Yasurime yasurime;

    Bohi bohi;

    Koshirae koshirae;

    Polish polish;

    Period period;

    School school;

    Origami origami;

    Attribution attribution;

    Other other;
}
