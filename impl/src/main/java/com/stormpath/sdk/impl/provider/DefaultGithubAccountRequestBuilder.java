/*
 * Copyright 2014 Stormpath, Inc.
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
package com.stormpath.sdk.impl.provider;

import com.stormpath.sdk.provider.GithubAccountRequestBuilder;
import com.stormpath.sdk.provider.ProviderData;

import java.util.Map;

/**
 * @since 1.0.0
 */
public class DefaultGithubAccountRequestBuilder extends AbstractSocialProviderAccountRequestBuilder<GithubAccountRequestBuilder> implements GithubAccountRequestBuilder {

    @Override
    protected String getConcreteProviderId() {
        return IdentityProviderType.GITHUB.getNameKey();
    }

    @Override
    protected ProviderData newProviderData(Map<String, Object> properties) {
        return new DefaultGithubProviderData(null, properties);
    }
}