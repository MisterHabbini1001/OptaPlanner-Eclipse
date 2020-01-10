/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
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
package org.optaplanner.examples.cloudbalancing.optional.benchmark;
import org.optaplanner.examples.common.app.CommonBenchmarkApp;

public class CloudBalancingBenchmarkApp extends CommonBenchmarkApp 
{
    public static void main(String[] args) 
    {
        new CloudBalancingBenchmarkApp().buildAndBenchmark(args);
    }

    public CloudBalancingBenchmarkApp() 
    {
        super(
                new ArgOption("default",
                        "org/optaplanner/examples/cloudbalancing/optional/benchmark/cloudBalancingBenchmarkConfig.xml"),
                new ArgOption("stepLimit",
                        "org/optaplanner/examples/cloudbalancing/optional/benchmark/cloudBalancingStepLimitBenchmarkConfig.xml"),
                new ArgOption("scoreDirector",
                        "org/optaplanner/examples/cloudbalancing/optional/benchmark/cloudBalancingScoreDirectorBenchmarkConfig.xml"),
                new ArgOption("template",
                        "org/optaplanner/examples/cloudbalancing/optional/benchmark/cloudBalancingBenchmarkConfigTemplate.xml.ftl", true)
        );
    }
}
