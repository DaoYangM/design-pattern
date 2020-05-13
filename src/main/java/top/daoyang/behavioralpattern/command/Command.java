package top.daoyang.behavioralpattern.command;

import lombok.RequiredArgsConstructor;

/**
 * 命令模式
 */
public interface Command {

    void execute();

    @RequiredArgsConstructor
    class TVOpenCommand implements Command {

        private final TV tv;

        @Override
        public void execute() {
            tv.open();
        }
    }

    @RequiredArgsConstructor
    class TVCloseCommand implements Command {
        private final TV tv;

        @Override
        public void execute() {
            tv.close();
        }
    }

    class TV {
        public void open() {
            System.out.println("Open TV");
        }

        public void close() {
            System.out.println("Close TV");
        }
    }

    @RequiredArgsConstructor
    class TVRemoteController {
        private final Command tvOpenCommand;

        private final Command tvCloseCommand;

        public void open() {
            tvOpenCommand.execute();
        }

        public void close() {
            tvCloseCommand.execute();
        }
    }
}
