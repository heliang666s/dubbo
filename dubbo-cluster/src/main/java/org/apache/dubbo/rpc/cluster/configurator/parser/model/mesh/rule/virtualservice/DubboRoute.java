/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.rpc.cluster.configurator.parser.model.mesh.rule.virtualservice;

import org.apache.dubbo.rpc.cluster.configurator.parser.model.mesh.rule.virtualservice.match.StringMatch;

import java.util.List;

public class DubboRoute {
    private String name;
    private List<StringMatch> services;
    private List<DubboRouteDetail> routedetail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StringMatch> getServices() {
        return services;
    }

    public void setServices(List<StringMatch> services) {
        this.services = services;
    }

    public List<DubboRouteDetail> getRoutedetail() {
        return routedetail;
    }

    public void setRoutedetail(List<DubboRouteDetail> routedetail) {
        this.routedetail = routedetail;
    }

    @Override
    public String toString() {
        return "DubboRoute{" + "name='" + name + '\'' + ", services=" + services + ", routedetail=" + routedetail + '}';
    }
}
