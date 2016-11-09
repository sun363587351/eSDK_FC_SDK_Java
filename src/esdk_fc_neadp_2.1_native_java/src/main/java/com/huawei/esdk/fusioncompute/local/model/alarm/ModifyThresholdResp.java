/**
 * Copyright 2015 Huawei Technologies Co., Ltd. All rights reserved.
 * eSDK is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   
 * http://www.apache.org/licenses/LICENSE-2.0 
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huawei.esdk.fusioncompute.local.model.alarm;

/**
 * 查询所有阈值项返回信息。
 * <p>
 * @since eSDK Cloud V100R003C50
 */
public class ModifyThresholdResp
{
    /**
     * 返回结果，0：代表成功。
     */
    private Integer result;
    
    public Integer getResult()
    {
        return result;
    }
    
    public void setResult(Integer result)
    {
        this.result = result;
    }
    
}
