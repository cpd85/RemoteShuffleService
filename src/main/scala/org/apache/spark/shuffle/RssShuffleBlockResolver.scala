/*
 * Copyright (c) 2020 Uber Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.shuffle

import org.apache.spark.network.buffer.ManagedBuffer
import org.apache.spark.network.shuffle.MergedBlockMeta
import org.apache.spark.storage.{BlockId, ShuffleBlockId, ShuffleMergedBlockId}

class RssShuffleBlockResolver extends ShuffleBlockResolver {

  override def getMergedBlockData(blockId: ShuffleMergedBlockId, dirs: Option[Array[String]]): Seq[ManagedBuffer] = {
      Seq()
    }

  override def getMergedBlockMeta(blockId: ShuffleMergedBlockId, dirs: Option[Array[String]]): MergedBlockMeta = {
    throw new UnsupportedOperationException("getMergedBlockMeta not supported")
  }
  override def getBlockData(blockId: BlockId, dirs: Option[Array[String]]): ManagedBuffer = {
    throw new RuntimeException("RssShuffleBlockResolver.getBlockData not implemented")
  }

  override def stop(): Unit = {
  }
}
