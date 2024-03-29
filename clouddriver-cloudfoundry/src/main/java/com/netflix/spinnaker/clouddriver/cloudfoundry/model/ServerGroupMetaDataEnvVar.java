/*
 * Copyright 2019 Pivotal, Inc.
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

package com.netflix.spinnaker.clouddriver.cloudfoundry.model;

public enum ServerGroupMetaDataEnvVar {
  JobName(ServerGroupMetaDataEnvVar.PREFIX + "BUILD_JOB_NAME"),
  JobNumber(ServerGroupMetaDataEnvVar.PREFIX + "BUILD_JOB_NUMBER"),
  JobUrl(ServerGroupMetaDataEnvVar.PREFIX + "BUILD_JOB_URL"),
  ArtifactName(ServerGroupMetaDataEnvVar.PREFIX + "ARTIFACT_NAME"),
  ArtifactVersion(ServerGroupMetaDataEnvVar.PREFIX + "ARTIFACT_VERSION"),
  ArtifactUrl(ServerGroupMetaDataEnvVar.PREFIX + "ARTIFACT_URL"),
  PipelineId(ServerGroupMetaDataEnvVar.PREFIX + "PIPELINE_ID");

  public static final String PREFIX = "__SPINNAKER_";
  public final String envVarName;

  ServerGroupMetaDataEnvVar(String envVarName) {
    this.envVarName = envVarName;
  }

  public static boolean contains(String envVar) {
    for (ServerGroupMetaDataEnvVar v : values()) {
      if (v.envVarName.equals(envVar)) {
        return true;
      }
    }
    return false;
  }
}
