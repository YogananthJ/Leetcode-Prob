/**
 * @param {...(null|boolean|number|string|Array|Object)} args
 * @return {number}
 */
var argumentsLength = function(...args) {
    const c = args.length;
    return c;
};

/**
 * argumentsLength(1, 2, 3); // 3
 */