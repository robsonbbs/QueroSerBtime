package io.btime.palavraprima.presenter;

import org.junit.Test;

import io.btime.palavraprima.contract.MainContract;
import io.btime.palavraprima.presenter.main.MainPresenter;
import io.btime.palavraprima.util.generic.ResourceManager;

public class MainPresenterUnitTest {
    private static final String WORD = "Robson";

    @Test
    public void verifyWord(){
        MainContract.View view = new MainContract.View() {
            @Override
            public void showResult(String result) {

            }
        };
        ResourceManager resourceManager = new ResourceManager() {
            @Override
            public String getPrimeString() {
                return null;
            }

            @Override
            public String getNotPrimeString() {
                return null;
            }
        };

        MainPresenter mainPresenter = new MainPresenter(view,resourceManager);
        mainPresenter.onButtonClicked(WORD);
    }
}
