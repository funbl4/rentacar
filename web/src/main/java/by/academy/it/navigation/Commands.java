package by.academy.it.navigation;

import by.academy.it.navigation.commands.Command;

public enum Commands {
    REGISTRATION {
        @Override
        public Command getCommand() {
            return new RegistrationCommand();
        }
    },
    ADD_USER {
        @Override
        public Command getCommand() {
            return new AddUserCommand();
        }
    },
    LIST_USERS {
        @Override
        public Command getCommand() {
            return new ListUsersCommand();
        }
    },
    SAVE_USER {
        @Override
        public Command getCommand() {
            return new SaveUserCommand();
        }
    },
    ADD_CAR {
        @Override
        public Command getCommand() {
            return new AddCarCommand();
        }
    },
    GET_CAR {
        @Override
        public Command getCommand() {
            return new GetCarCommand();
        }
    },
    DELETE_CAR {
        @Override
        public Command getCommand() {
            return new DeleteCarCommand();
        }
    },
    MODIFY_CAR {
        @Override
        public Command getCommand() {
            return new ModifyCarCommand();
        }
    },
    UPDATE_CAR {
        @Override
        public Command getCommand() {
            return new UpdateCarCommand();
        }
    },
    LIST_CARS {
        @Override
        public Command getCommand() {
            return new ListCarsCommand();
        }
    },
    SAVE_CAR {
        @Override
        public Command getCommand() {
            return new SaveCarCommand();
        }
    },
    ADD_ORDER {
        @Override
        public Command getCommand() {
            return new AddOrderCommand();
        }
    },
    LIST_USER_ORDERS {
        @Override
        public Command getCommand() {
            return new ListUserOrdersCommand();
        }
    },
    PAYMENT {
        @Override
        public Command getCommand() {
            return new PaymentCommand();
        }
    },
    LIST_ORDERS {
        @Override
        public Command getCommand() {
            return new ListOrdersCommand();
        }
    },
    SAVE_ORDER {
        @Override
        public Command getCommand() {
            return new SaveOrderCommand();
        }
    },
    GET_USER {
        @Override
        public Command getCommand() {
            return new GetUserCommand();
        }
    },
    LOGIN {
        @Override
        public Command getCommand() {
            return new LoginCommand();
        }
    },
    LOGOUT {
        @Override
        public Command getCommand() {
            return new LogoutCommand();
        }
    };

    public abstract Command getCommand();
}
