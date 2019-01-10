
package com.neo.repository;

import com.neo.model.Message;

/**
 * @author luosihao
 */
public interface MessageRepository {

	Iterable<Message> findAll();

	Message save(Message message);

	Message findMessage(Long id);

	void deleteMessage(Long id);

}
