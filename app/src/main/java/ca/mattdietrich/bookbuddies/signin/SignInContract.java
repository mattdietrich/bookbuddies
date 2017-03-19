package ca.mattdietrich.bookbuddies.signin;

public interface SignInContract {

    interface View {
        void showGoogleSignIn();
    }

    interface Actions {
        void onClickSignInWithGoogle();
    }
}
