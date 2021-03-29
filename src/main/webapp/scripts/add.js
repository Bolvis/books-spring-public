/**
 * custom validation function of form using to add books
 * */
const validate = () => {
    const name = document.getElementById("name");
    const surname = document.getElementById("surname");
    const form = document.getElementById("form");
    const message = document.getElementById("message");

    if (name.value[0] === "A" || surname.value[0] === "A") {
        form.submit();
        return;
    }
    message.innerText = "Author's name or surname must start with 'A'";
}
