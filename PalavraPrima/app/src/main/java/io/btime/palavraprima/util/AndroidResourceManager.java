package io.btime.palavraprima.util;

import android.content.Context;
import android.content.res.Resources;

import io.btime.palavraprima.R;
import io.btime.palavraprima.util.generic.ResourceManager;

public class AndroidResourceManager implements ResourceManager {
    private Resources resources;

    public AndroidResourceManager(Context context) {
        resources = new Resources(context.getAssets(), null, null);
    }

    @Override
    public String getPrimeString() {
        return resources.getString(R.string.prime_word);
    }

    @Override
    public String getNotPrimeString() {
        return resources.getString(R.string.not_prime_word);
    }
}
