// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.lib.selectorfields.v201406.cm;

import com.google.api.ads.adwords.lib.selectorfields.EntityField;
import com.google.api.ads.adwords.lib.selectorfields.Filterable;

/**
 * A {@code Enum} to facilitate the selection of fields for {@code ManagedCustomer}.
 */
public enum ManagedCustomerField implements EntityField {

  // Fields constants definitions

  /**
   * Whether this account can manage clients.
   * This field is read only for external clients and will be ignored when sent to the API.
   */
  @Filterable
  CanManageClients(true),

  /**
   * The company name of the account, if any.
   */
  @Filterable
  CompanyName(true),

  /**
   * The currency in which this account operates.
   * We support a subset of the currency codes derived from the ISO 4217 standard.
   * See <a href="https://developers.google.com/adwords/api/docs/appendix/currencycodes" >Currency Codes</a> for the currently supported currencies.
   */
  @Filterable
  CurrencyCode(true),

  /**
   * The 10-digit ID that uniquely identifies the AdWords account.
   */
  @Filterable
  CustomerId(true),

  /**
   * The local timezone ID for this customer.
   * See <a href="https://developers.google.com/adwords/api/docs/appendix/timezones" >Time Zone Codes</a> for the currently supported list.
   */
  @Filterable
  DateTimeZone(true),

  /**
   * The email address of the account's first login user, if any.
   */
  @Filterable
  Login(true),

  /**
   * The name used by the manager to refer to the client.
   */
  @Filterable
  Name(true),

  /**
   * Whether this managed customer's account is a test account.
   */
  TestAccount(false),

  ;

  private final boolean isFilterable;

  private ManagedCustomerField(boolean isFilterable) {
    this.isFilterable = isFilterable;
  }

  public boolean isFilterable() {
    return this.isFilterable;
  }

}
