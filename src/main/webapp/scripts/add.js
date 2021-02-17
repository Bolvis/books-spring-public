/**
 * custom validation function of form using to add books
 * */
const validate = () => {
    const author = document.getElementById("author");
    const form = document.getElementById("form");
    const message = document.getElementById("message");
    const authorFullName = author.value.split(" ");
    const authorForename = authorFullName[0];
    const authorSurname = authorFullName[authorFullName.length - 1];

    if (authorForename[0] === "A" || authorSurname[0] === "A") {
        form.submit();
    }else {
        message.innerText = "Author's name or surname have to start with 'A'";
    }
}
