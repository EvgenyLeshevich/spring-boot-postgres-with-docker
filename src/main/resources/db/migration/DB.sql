-- user
CREATE TABLE IF NOT EXISTS users
(
    id              BIGSERIAL PRIMARY KEY,
    name            VARCHAR(255),
    surname         VARCHAR(255)
);