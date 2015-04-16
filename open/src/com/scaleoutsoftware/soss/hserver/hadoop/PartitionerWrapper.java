/*
 Copyright (c) 2015 by ScaleOut Software, Inc.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
*/
package com.scaleoutsoftware.soss.hserver.hadoop;

/**
 * Abstract wrapper for the Hadoop partitioner.
 * @param <K> key type
 * @param <V> value type
 */
public abstract class PartitionerWrapper<K, V> {
    protected final int numberOfPartitions;

    protected PartitionerWrapper(int numberOfPartitions) {
        this.numberOfPartitions = numberOfPartitions;
    }

    public abstract int getPartition(K key, V value);

    public int getNumberOfPartitions()
    {
        return numberOfPartitions;
    }
}