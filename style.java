html
script
body
head
title
style
"stylesheet" href="body1.css">
   <script>
            const usernameInput = document.getElementById('username');
            const passwordInput = document.querySelector('input[type="password"]');
            const signInBtn = document.getElementById('signInBtn');

            function checkFields() {
            const usernameValid = usernameInput.value.trim().length > 0;
            const passwordValid = passwordInput.value.trim().length > 0;
            
            signInBtn.disabled = !(usernameValid && passwordValid);
            }

            usernameInput.addEventListener('input', checkFields);
            passwordInput.addEventListener('input', checkFields);
            
            // Initialize button as disabled
            checkFields();
        </script>
