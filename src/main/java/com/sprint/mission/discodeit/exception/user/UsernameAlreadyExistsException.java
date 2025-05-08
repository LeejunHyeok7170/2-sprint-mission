package com.sprint.mission.discodeit.exception.user;

import com.sprint.mission.discodeit.exception.ErrorCode;

import java.util.Map;

public class UsernameAlreadyExistsException extends UserException {

  public UsernameAlreadyExistsException(String username) {
    super(ErrorCode.DUPLICATE_USER, Map.of("username", username));
  }
}
