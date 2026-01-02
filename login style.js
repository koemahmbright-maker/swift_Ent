// Get references to the input fields and sign-in button
const usernameInput = document.getElementById('username');
const passwordInput = document.getElementById('password');
const signInButton = document.getElementById('signInButton');

// Validates inputs - Checks if both fields have non-empty values (using `trim()`)
function checkInputs() {
    if (usernameInput.value.trim() && passwordInput.value.trim()) {
        signInButton.disabled = false;
    } else {
        signInButton.disabled = true;
    }
}

usernameInput.addEventListener('input', checkInputs);
passwordInput.addEventListener('input', checkInputs);