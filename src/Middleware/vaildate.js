
function validation(req, res, next) {
    const { username, password } = req.body;

    if (!username || username.length > 20) {
        next("Missing or username exceed 20 characters");
    }

    if (!password || password.length > 8) {
        next("Missing or password exceed 8 characters");
    }

    next();
}
module.exports = validation;