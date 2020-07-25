package org.academiadecodigo.felinux.view;

import org.academiadecodigo.felinux.controller.WaitingController;

public class WaitingView extends AbstractView{

    WaitingController waitingController;

    public void setWaitingController(WaitingController waitingController) {
        this.waitingController = waitingController;
    }

    @Override
    public void show() {

        printStream.println(Messages.WAITING);

        //Invocar aqui o broadcast?

    }
}
