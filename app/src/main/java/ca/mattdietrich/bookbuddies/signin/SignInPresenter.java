package ca.mattdietrich.bookbuddies.signin;

import android.support.annotation.NonNull;

public class SignInPresenter implements SignInContract.Actions {

    private final SignInContract.View mSignInView;

    public SignInPresenter(@NonNull SignInContract.View signInView) {
        this.mSignInView = signInView;
    }

    @Override
    public void onClickSignInWithGoogle() {
        mSignInView.showGoogleSignIn();
    }
}
