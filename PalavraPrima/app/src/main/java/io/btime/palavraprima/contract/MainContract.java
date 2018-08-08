package io.btime.palavraprima.contract;

public interface MainContract {

    interface View {

        void showResult(String result);

    }

    interface Presenter {

        void onButtonClicked(String word);

    }
}
