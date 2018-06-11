/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.beam.sdk.extensions.euphoria.beam;

import org.apache.beam.sdk.extensions.euphoria.beam.testkit.CountByKeyTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.DistinctTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.FilterTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.FlatMapTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.JoinTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.MapElementsTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.ReduceByKeyTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.SumByKeyTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.UnionTest;
import org.apache.beam.sdk.extensions.euphoria.beam.testkit.junit.TestSuiteRunner;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Euphoria operators test suite.
 */
@RunWith(TestSuiteRunner.class)
@Suite.SuiteClasses({
//        BroadcastHashJoinTest.class,
    CountByKeyTest.class,
    DistinctTest.class,
    FilterTest.class,
    FlatMapTest.class,
    JoinTest.class,
    MapElementsTest.class,
    ReduceByKeyTest.class,
    //    ReduceStateByKeyTest.class,
    SumByKeyTest.class,
//    TopPerKeyTest.class, - uncomment when ReduceStateByKey is supported
    UnionTest.class,
//        WindowingTest.class,
})
public class OperatorsTestSuite {

}
