package practice_spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import practice_spring.vo.PlayerVO;


@Component("player")
public class PlayerDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private PlayerMapper mapper = new PlayerMapper();

	public PlayerDao() {

	}

	public PlayerDao(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insert(PlayerVO player) {
		String sql = "insert into player(number,name,team,age,nation) value(?,?,?,?,?)";
		return jdbcTemplate.update(sql, player.getNumber(), player.getName(), player.getTeam(), player.getAge(),
				player.getNation());

	}

	public PlayerVO select(int number) {
		String sql = "select * from player where number=?";
		return jdbcTemplate.queryForObject(sql, mapper, number);
	}
	public List<PlayerVO> selectAll() {
		String sql = "select * from player";
		return jdbcTemplate.query(sql, mapper);
	}

	class PlayerMapper implements RowMapper<PlayerVO> {

		@Override
		public PlayerVO mapRow(ResultSet rs, int arg1) throws SQLException {
			PlayerVO p = new PlayerVO();
			 p.setNumber(rs.getInt(1));
			 p.setName(rs.getString(2));
			 p.setTeam(rs.getString(3));
			 p.setAge(rs.getInt(4));
			 p.setNation(rs.getString(5));

//			p.setAge(rs.getInt("age"));
//			p.setName(rs.getString("name"));
//			p.setNation(rs.getString("nation"));
//			p.setNumber(rs.getInt("number"));
//			p.setTeam(rs.getString("team"));

			return p;
		}

	}

}
