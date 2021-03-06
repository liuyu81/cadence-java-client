/*
 *  Copyright 2012-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *  Modifications copyright (C) 2017 Uber Technologies, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"). You may not
 *  use this file except in compliance with the License. A copy of the License is
 *  located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 *  or in the "license" file accompanying this file. This file is distributed on
 *  an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *  express or implied. See the License for the specific language governing
 *  permissions and limitations under the License.
 */

package com.uber.cadence.workflow;

import com.uber.cadence.ActivityType;

/**
 * Indicates that an activity implementation threw an unhandled exception. Contains the unhandled
 * exception as a cause. Note that an unhandled exception stack trace might belong to a separate
 * process or even program.
 */
public final class ActivityFailureException extends ActivityException {

  public ActivityFailureException(
      long eventId, ActivityType activityType, String activityId, Throwable cause) {
    super(cause.getMessage(), eventId, activityType, activityId);
    initCause(cause);
  }
}
