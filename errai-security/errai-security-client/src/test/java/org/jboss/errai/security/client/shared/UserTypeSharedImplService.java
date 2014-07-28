package org.jboss.errai.security.client.shared;

import org.jboss.errai.bus.server.annotations.Remote;
import org.jboss.errai.security.shared.api.annotation.RestrictedAccess;

@Remote
@RestrictedAccess(roles = "user")
public interface UserTypeSharedImplService {

  void someUserService();

}