/*
 * Copyright (c) 2024, WSO2 LLC. (https://www.wso2.com). All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.connector.ai.model.prompt;

/**
 * A template class for sending the request to OpenAI in prompt mode.
 */
@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class AIRequestSchema {
    private final String prompt;
    private final String payload;
    private final String headers;

    public AIRequestSchema(String prompt, String payload, String headers) {
        this.prompt = prompt;
        this.payload = payload;
        this.headers = headers;
    }
}
