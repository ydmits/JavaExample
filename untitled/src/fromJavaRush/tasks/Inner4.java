package fromJavaRush.tasks;

public class Inner4 {
    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super(Constants.SERVER_IS_CURRENTLY_NOT_ACCESSIBLE);
        }

        public ServerNotAccessibleException(Throwable cause) {
            super(Constants.SERVER_IS_CURRENTLY_NOT_ACCESSIBLE, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(Constants.USER_IS_NOT_AUTHORIZED);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(Constants.USER_IS_NOT_AUTHORIZED, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(Constants.USER_IS_BANNED);
        }

        public BannedUserException(Throwable cause) {
            super(Constants.USER_IS_BANNED, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(Constants.ACCESS_IS_DENIED);
        }

        public RestrictionException(Throwable cause) {
            super(Constants.ACCESS_IS_DENIED, cause);
        }
    }

    public final static class Constants {
        public static final String SERVER_IS_CURRENTLY_NOT_ACCESSIBLE = "The server is currently not accessible.";
        public static final String USER_IS_NOT_AUTHORIZED = "The user is not authorized.";
        public static final String USER_IS_BANNED = "The user is banned.";
        public static final String ACCESS_IS_DENIED = "Access is denied.";
    }
}
