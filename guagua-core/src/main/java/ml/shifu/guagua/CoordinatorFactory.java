/*
 * Copyright [2013-2014] PayPal Software Foundation
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ml.shifu.guagua;

import ml.shifu.guagua.io.Bytable;
import ml.shifu.guagua.master.MasterInterceptor;
import ml.shifu.guagua.worker.WorkerInterceptor;

/**
 * Coordinator factory to create sync or async coordinator.
 * 
 * @param <MASTER_RESULT>
 *            master result for computation in each iteration.
 * @param <WORKER_RESULT>
 *            worker result for computation in each iteration.
 */
public interface CoordinatorFactory<MASTER_RESULT extends Bytable, WORKER_RESULT extends Bytable> {

    /**
     * Create coordinator instance for master.
     */
    MasterInterceptor<MASTER_RESULT, WORKER_RESULT> createMasterCoordinator();

    /**
     * Create coordinator instance for worker.
     */
    WorkerInterceptor<MASTER_RESULT, WORKER_RESULT> createWorkerCoordinator();
}
