/*
 *  ---license-start
 *  eu-digital-green-certificates / dgca-verifier-app-android
 *  ---
 *  Copyright (C) 2021 T-Systems International GmbH and all other contributors
 *  ---
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ---license-end
 *
 *  Created by mykhailo.nester on 4/30/21 1:44 PM
 */

package dgca.verifier.app.decoder.model

import com.fasterxml.jackson.annotation.JsonProperty
import java.io.Serializable

data class Test(

    @JsonProperty("tg")
    val disease: String,

    @JsonProperty("tt")
    val typeOfTest: String,

    @JsonProperty("nm")
    val testName: String?,

    @JsonProperty("ma")
    val testNameAndManufacturer: String?,

    @JsonProperty("sc")
    val dateTimeOfCollection: String,

    @JsonProperty("dr")
    val dateTimeOfTestResult: String?,

    @JsonProperty("tr")
    val testResult: String,

    @JsonProperty("tc")
    val testingCentre: String,

    @JsonProperty("co")
    val countryOfVaccination: String,

    @JsonProperty("is")
    val certificateIssuer: String,

    @JsonProperty("ci")
    val certificateIdentifier: String

) : Serializable