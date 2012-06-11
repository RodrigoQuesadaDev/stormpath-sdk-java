/*
 * Copyright 2012 Stormpath, Inc.
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
package com.stormpath.sdk.account.impl;

import com.stormpath.sdk.account.Account;
import com.stormpath.sdk.ds.DataStore;
import com.stormpath.sdk.resource.Status;
import com.stormpath.sdk.resource.impl.AbstractResource;

import java.util.Map;

/**
 * @since 0.1
 */
public class DefaultAccount extends AbstractResource implements Account {

    private final String USERNAME = "username";
    private final String EMAIL = "email";
    private final String GIVEN_NAME = "givenName";
    private final String MIDDLE_NAME = "middleName";
    private final String SURNAME = "surname";
    private final String STATUS = "status";

    public DefaultAccount(DataStore dataStore) {
        super(dataStore);
    }

    public DefaultAccount(DataStore dataStore, Map<String,Object> properties) {
        super(dataStore, properties);
    }

    @Override
    public String getUsername() {
        return getStringProperty(USERNAME);
    }

    @Override
    public void setUsername(String username) {
        setProperty(USERNAME, username);
    }

    @Override
    public String getEmail() {
        return getStringProperty(EMAIL);
    }

    @Override
    public void setEmail(String email) {
        setProperty(EMAIL, email);
    }

    @Override
    public String getGivenName() {
        return getStringProperty(GIVEN_NAME);
    }

    @Override
    public void setGivenName(String givenName) {
        setProperty(GIVEN_NAME, givenName);
    }

    @Override
    public String getMiddleName() {
        return getStringProperty(MIDDLE_NAME);
    }

    @Override
    public void setMiddleName(String middleName) {
        setProperty(MIDDLE_NAME, middleName);
    }

    @Override
    public String getSurname() {
        return getStringProperty(SURNAME);
    }

    @Override
    public void setSurname(String surname) {
        setProperty(SURNAME, surname);
    }

    @Override
    public Status getStatus() {
        String value = getStringProperty(STATUS);
        if (value == null) {
            return null;
        }
        return Status.valueOf(value.toUpperCase());
    }

    @Override
    public void setStatus(Status status) {
        setProperty(STATUS, status.name());
    }
}
