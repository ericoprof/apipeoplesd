CREATE TABLE IF NOT EXISTS address (
    id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    person_id BIGINT NOT NULL,
    street VARCHAR(255) NOT NULL,
    zip_code VARCHAR(60) NOT NULL,
    number VARCHAR(60) NOT NULL,
    city VARCHAR(60) NOT NULL,
    is_primary BOOLEAN NOT NULL DEFAULT false,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    deleted_at TIMESTAMP DEFAULT NULL,

    FOREIGN KEY (person_id) REFERENCES person(id)
);