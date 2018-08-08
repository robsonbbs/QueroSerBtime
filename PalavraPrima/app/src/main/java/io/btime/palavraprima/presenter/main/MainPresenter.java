package io.btime.palavraprima.presenter.main;

import io.btime.palavraprima.contract.MainContract;
import io.btime.palavraprima.model.Word;
import io.btime.palavraprima.util.generic.ResourceManager;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View mView;
    private ResourceManager mResourceManager;
    private Word word;

    public MainPresenter(MainContract.View view, ResourceManager resourceManager) {
        mView = view;
        mResourceManager = resourceManager;
        word = new Word();
    }

    /**
     * @param strWord: Word to check if is prime
     */
    @Override
    public void onButtonClicked(String strWord) {
        word.setWord(strWord);

        if (word.isPrime()) {
            mView.showResult(mResourceManager.getPrimeString());
        } else {
            mView.showResult(mResourceManager.getNotPrimeString());
        }
    }
}
